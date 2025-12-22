package irvine.oeis.a082;

import irvine.oeis.PrependSequence;
import irvine.oeis.a077.A077528;

/**
 * A082743 a(0)=1, a(1)=2; for n &gt;= 2, a(n) is smallest palindrome greater than 1 which is congruent to 1 (mod n).
 * @author Sean A. Irvine
 */
public class A082743 extends PrependSequence {

  /** Construct the sequence. */
  public A082743() {
    super(0, new A077528(), 1, 2);
  }
}
