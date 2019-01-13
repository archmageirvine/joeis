package irvine.math.group;

import irvine.math.api.Group;
import irvine.math.z.Z;
import irvine.math.api.Field;


/**
 * A Galois field.
 * @author Sean A. Irvine
 */
public class GaloisField extends IntegersMod implements Field<Z> {

  private final Z mCharacteristic;

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
}
