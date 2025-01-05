package irvine.math.group;

import irvine.math.api.Field;
import irvine.math.api.Group;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;


/**
 * A Galois field.
 * @author Sean A. Irvine
 */
public class GaloisField extends IntegersMod implements Field<Z> {

  private final Z mCharacteristic;
  private final int mExponent;
  private final PolynomialRingField<Z> mBaseField;
  private final Polynomial<Z> mIrreducible;

  // These polynomials from SAGE:
  // for k in range(1, 50):
  //  print(str(GF(2^k).modulus().coefficients(sparse=False)))

  private static final long[][] IRR2 = {
    {1, 1},
    {1, 1, 1},
    {1, 1, 0, 1},
    {1, 1, 0, 0, 1},
    {1, 0, 1, 0, 0, 1},
    {1, 1, 0, 1, 1, 0, 1},
    {1, 1, 0, 0, 0, 0, 0, 1},
    {1, 0, 1, 1, 1, 0, 0, 0, 1},
    {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
    {1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1},
    {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1},
    {1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
    {1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
  };

  private static final long[][] IRR3 = {
    null, // 0 -- not used
    {2, 1},
    {2, 2, 1},
    {1, 2, 0, 1},
    {2, 0, 0, 2, 1},
    {1, 2, 0, 0, 0, 1},
    {2, 2, 1, 0, 2, 0, 1},
    {1, 0, 2, 0, 0, 0, 0, 1},
    {2, 2, 2, 0, 1, 2, 0, 0, 1},
    {1, 1, 2, 2, 0, 0, 0, 0, 0, 1},
    {2, 1, 0, 0, 2, 2, 2, 0, 0, 0, 1},
    {1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1},
    {1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 0, 1, 2, 0, 1, 2, 1, 1, 2, 0, 0, 0, 0, 1},
    {1, 1, 2, 0, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1},
    {2, 1, 2, 2, 2, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 0, 2, 0, 2, 1, 2, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 1, 0, 2, 2, 2, 0, 0, 1, 1, 1, 1, 0, 2, 0, 0, 0, 0, 0, 0, 1},
    {1, 2, 0, 2, 0, 1, 2, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 2, 0, 1, 0, 1, 1, 1, 2, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 2, 0, 2, 2, 0, 2, 0, 2, 0, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 2, 1, 1, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 1, 2, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 0, 0, 1, 2, 0, 2, 0, 1, 1, 1, 2, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 2, 2, 1, 2, 2, 1, 2, 0, 2, 2, 2, 0, 2, 1, 0, 2, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 1, 0, 1, 2, 1, 2, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 2, 1, 2, 2, 1, 0, 0, 1, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 0, 0, 0, 2, 0, 2, 1, 0, 2, 0, 1, 2, 0, 2, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 2, 0, 2, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 1, 1, 1, 0, 2, 2, 0, 2, 1, 2, 2, 0, 2, 2, 0, 1, 1, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 2, 0, 1, 2, 2, 2, 0, 2, 2, 1, 0, 2, 2, 2, 2, 1, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 2, 0, 1, 0, 1, 2, 0, 1, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 0, 1, 2, 1, 1, 2, 2, 1, 0, 1, 2, 0, 2, 0, 1, 1, 2, 0, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 2, 0, 2, 0, 1, 0, 0, 2, 1, 0, 2, 1, 1, 2, 1, 2, 1, 1, 1, 0, 0, 2, 1, 0, 2, 2, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 0, 1, 1, 2, 2, 1, 1, 0, 0, 1, 0, 1, 0, 2, 2, 0, 1, 1, 0, 2, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 0, 0, 1, 1, 2, 0, 1, 2, 2, 0, 1, 2, 0, 1, 1, 2, 2, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 0, 1, 2, 2, 1, 0, 1, 0, 2, 1, 0, 0, 1, 2, 2, 0, 2, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {2, 0, 1, 2, 1, 0, 2, 0, 2, 0, 2, 2, 0, 2, 1, 0, 0, 1, 1, 1, 1, 2, 1, 0, 2, 0, 2, 2, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
  };

  /**
   * Construct the Galois field <code>GF(p^k)</code>.
   * @param p prime base
   * @param k order
   */
  public GaloisField(final Z p, final int k) {
    super(p.pow(k));
    if (!p.isPrime()) {
      throw new IllegalArgumentException();
    }
    mCharacteristic = p;
    mExponent = k;
    if (k > 1) {
      mBaseField = new PolynomialRingField<>(new GaloisField(p));
      if (Z.TWO.equals(p)) {
        mIrreducible = Polynomial.create(IRR2[k]);
      } else if (Z.THREE.equals(p)) {
        mIrreducible = Polynomial.create(IRR3[k]);
      } else {
        mIrreducible = null;
      }
    } else {
      mBaseField = null;
      mIrreducible = null;
    }
  }

  /**
   * Construct the Galois field <code>GF(p)</code>.
   * @param p prime base
   */
  public GaloisField(final Z p) {
    this(p, 1);
  }

  /**
   * Construct the Galois field <code>GF(p)</code>.
   * @param p prime base
   */
  public GaloisField(final long p) {
    this(Z.valueOf(p), 1);
  }

  @Override
  public Z inverse(final Z element) {
    return element.modInverse(size());
  }

  @Override
  public Z divide(final Z n, final Z d) {
    return n.modMultiply(inverse(d), size());
  }

  @Override
  public Group<Z> multiplicativeGroup() {
    return new MultiplicativeGroup<>(this);
  }

  @Override
  public Z characteristic() {
    return mCharacteristic;
  }

  private Polynomial<Z> unpack(final PolynomialRing<Z> ring, final Z n) {
    // Convert n to a polynomial representation in base p
    final Polynomial<Z> a = ring.empty();
    Z m = n;
    while (!m.isZero()) {
      final Z[] qr = m.divideAndRemainder(mCharacteristic);
      a.add(qr[1]);
      m = qr[0];
    }
    return a;
  }

  private Z pack(final Polynomial<Z> p) {
    // Convert a polynomial to an integer in base mCharacteristic
    Z res = Z.ZERO;
    for (int k = p.degree(); k >= 0; --k) {
      res = res.multiply(mCharacteristic).add(p.coeff(k));
    }
    return res;
  }

  @Override
  public Z multiply(final Z a, final Z b) {
    if (mExponent == 1) {
      return super.multiply(a, b);
    }
    if (mIrreducible != null) {
      return pack(mBaseField.mod(mBaseField.multiply(unpack(mBaseField, a), unpack(mBaseField, b)), mIrreducible));
    }
    throw new UnsupportedOperationException("Please update GaloisField with irreducible polynomial for " + this);
  }

  @Override
  public Z pow(final Z a, final long n) {
    // Note: super.pow(a, n) would do the right thing in every case, but is
    // slow for exponent > 1 due to conversions between representations
    if (mExponent == 1 || n <= 1) {
      return super.pow(a, n);
    }
    final Polynomial<Z> b = unpack(mBaseField, a);
    final Polynomial<Z> s = AbstractRing.pow(mBaseField, mBaseField.mod(mBaseField.multiply(b, b), mIrreducible), n / 2);
    return pack((n & 1) == 0 ? s : mBaseField.mod(mBaseField.multiply(s, b), mIrreducible));
  }

  public Polynomial<Z> characteristicPolynomial(final Z n) {
    if (mExponent <= 1) {
      return Polynomial.create(n.negate(), Z.ONE); // x - n
    }
    Polynomial<Z> cp = mBaseField.one();
    for (int k = 0; k < mExponent; ++k) {
      final Z t = pow(n, mCharacteristic.pow(k).longValueExact());
      cp = mBaseField.mod(mBaseField.multiply(cp, mBaseField.subtract(mBaseField.x(), unpack(mBaseField, t))), mIrreducible);
    }
    // This last addition for consistency with Sage and Magma
    return mBaseField.add(cp, mIrreducible);
  }
}
