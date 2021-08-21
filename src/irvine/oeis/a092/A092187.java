package irvine.oeis.a092;
// manually divmul at 2021-08-20 23:36

import irvine.math.z.Z;

/**
 * A092187 A092186(n)/2.
 * @author Georg Fischer
 */
public class A092187 extends A092186 {

  /** Construct the sequence */
  public A092187() {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(2);
  }
}
