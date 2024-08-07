package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-07-02/multrar at 2024-07-03 22:28

import irvine.oeis.DirectSequence;
import irvine.oeis.a004.A004719;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A370812 a(1) = 1; for n &gt;= 2, a(n) = noz(a(n-1) + 2*n - 1), where noz(n) = A004719(n).
 * @author Georg Fischer
 */
public class A370812 extends MultiTransformSequence {

  private static final DirectSequence A004719 = new A004719();

  /** Construct the sequence. */
  public A370812() {
    super(1, (self, n) -> A004719.a(self.a(n - 1).add(2L * n - 1)), "1");
  }
}
