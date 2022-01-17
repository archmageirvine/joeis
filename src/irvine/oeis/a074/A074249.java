package irvine.oeis.a074;
// manually A074476/parm3

import irvine.math.z.Z;

/**
 * A074249 a(0) = 1; for n &gt; 0, a(n) = largest prime factor of 7^n-1.
 * @author Georg Fischer
 */
public class A074249 extends A074477 {

  private int mN = -1;

  /** Construct the sequence. */
  public A074249() {
    super(7, -1);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return super.next();
  }
}
