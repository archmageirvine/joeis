package irvine.oeis.a258;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A258893 Number of (n+2) X (7+2) 0..1 arrays with no 3 X 3 subblock diagonal sum less than the antidiagonal sum or central row sum less than the central column sum.
 * @author Georg Fischer
 */
public class A258893 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A258893() {
    super(1, "[0,271350,-438371,-718106,1370362,545942,-1479832,-41458,602478,-38780,-54557,-18836]", "[1,-2,-2,6,0,-6,2,2,-1]");
  }
}
