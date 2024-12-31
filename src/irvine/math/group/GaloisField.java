package irvine.math.group;

import irvine.math.api.Field;
import irvine.math.api.Group;
import irvine.math.z.Z;


/**
 * A Galois field.
 * @author Sean A. Irvine
 */
public class GaloisField extends IntegersMod implements Field<Z> {

  private final Z mCharacteristic;
  private final int mExponent;

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

  // The following does not work

//  public Polynomial<Z> toPoly(final PolynomialRing<Z> ring, final Z n) {
//    // Convert n to a polynomial representation in base p
//    final Polynomial<Z> a = ring.empty();
//    Z m = n;
//    while (!m.isZero()) {
//      final Z[] qr = m.divideAndRemainder(characteristic());
//      a.add(qr[1]);
//      m = qr[0];
//    }
//    return a;
//  }
//
//  public Polynomial<Z> characteristicPolynomial(final Z n) {
//    final long p = characteristic().longValueExact();
//    final PolynomialRing<Z> ring = new PolynomialRing<>(new IntegersMod(p));
//    Polynomial<Z> cp = ring.one();
//    for (int k = 0; k < mExponent; ++k) {
//      final Polynomial<Z> t = toPoly(ring, n.modPow(characteristic().pow(k), size()));
//      //System.out.println(n + " -> t=" + t + " np was " + toPoly(ring, np));
//      cp = ring.multiply(cp, ring.subtract(ring.x(), t), k);
//      //assert cp.degree() < mExponent;
//    }
//    return cp;
//  }
}
