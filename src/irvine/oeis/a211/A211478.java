package irvine.oeis.a211;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A211478 Number of -1..1 arrays x(i) of n+1 elements i=1..n+1 with x(i)+x(j), x(i+1)+x(j+1), -(x(i)+x(j+1)), and -(x(i+1)+x(j)) having one, two or three distinct values for every i&lt;=n and j&lt;=n.
 * @author Georg Fischer
 */
public class A211478 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A211478() {
    super(1, "[0,9,-40,33,68,-99,-13,51,1,-6]", "[1,-7,15,-1,-33,28,12,-16,-1,2]");
  }
}
