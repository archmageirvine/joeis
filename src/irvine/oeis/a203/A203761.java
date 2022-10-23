package irvine.oeis.a203;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A203761 a(n)=f(a(n-1)+1,a(n-2),a(n-3)), where f(x,y,z)=yz+zx+xy and a(1)=0, a(2)=0, a(3)=1.
 * @author Georg Fischer
 */
public class A203761 extends Sequence1 {

  private int mN;
  private int mAdd1;
  private int mAdd2;
  private int mAdd3;
  private Z[] mA;
  private static final int MASK = 0b11;

  /** Construct the sequence. */
  public A203761() {
    this(1, 0, 0);
  }

  /**
   * Generic constructor with parameters
   * @param add1 add this to value of a(n-1)
   * @param add2 add this to value of a(n-2)
   * @param add3 add this to value of a(n-3)
   */
  public A203761(final int add1, final int add2, final int add3) {
    mN = 0;
    mAdd1 = add1;
    mAdd2 = add2;
    mAdd3 = add3;
    mA = new Z[] {Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE};
  }

  private Z f(final Z x, final Z y, final Z z) {
    return y.multiply(z).add(z.multiply(x)).add(x.multiply(y));
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= MASK) {
      return mA[mN];
    }
    final Z result = f(mA[(mN + 3) & MASK].add(mAdd1), mA[(mN + 2) & MASK].add(mAdd2), mA[(mN + 1) & MASK].add(mAdd3));
    mA[mN & MASK] = result;
    return result;
  }
}
