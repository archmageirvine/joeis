package irvine.oeis.a156;
// Generated by gen_seq4.pl simple/nest at 2023-03-20 18:29

import irvine.oeis.NestedSequence;
import irvine.oeis.a006.A006882;

/**
 * A156986 a(n) = (n!!)!!.
 * @author Georg Fischer
 */
public class A156986 extends NestedSequence {

  /** Construct the sequence. */
  public A156986() {
    super(0, new A006882(), new A006882(), 0, 0);
  }

}
