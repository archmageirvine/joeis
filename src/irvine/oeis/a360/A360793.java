package irvine.oeis.a360;
// Generated by gen_seq4.pl 2024-05-09/setdiff at 2024-05-09 22:36

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a030.A030078;
import irvine.oeis.a048.A048109;

/**
 * A360793 Numbers of the form m*p^3, where m &gt; 1 is squarefree and prime p does not divide m.
 * @author Georg Fischer
 */
public class A360793 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A360793() {
    super(1, new A048109(), new A030078());
  }
}
