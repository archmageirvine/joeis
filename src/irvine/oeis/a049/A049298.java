package irvine.oeis.a049;

import irvine.oeis.PrependSequence;
import irvine.oeis.a048.A048669;

/**
 * A049298 Take reduced residue systems of n, generate its first differences, dRRS(n); sequence gives maximal value of dRSSS(n).
 * @author Sean A. Irvine
 */
public class A049298 extends PrependSequence {

  /** Construct the sequence. */
  public A049298() {
    super(1, new A048669().skip(2), 0, 0);
  }
}
