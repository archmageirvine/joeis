package irvine.oeis.a104;

import irvine.oeis.FiniteSequence;

/**
 * A104972 Numbers with 5 distinct digits {1,2,3,4,5} such that all adjacent digits (as well as first and last digits) are coprime.
 * @author Georg Fischer
 */
public class A104972 extends FiniteSequence {

  /** Construct the sequence. */
  public A104972() {
    super(1, FINITE, 12345, 12354, 12534, 12543, 13254, 13452, 14325, 14352, 14523, 14532, 15234, 15432, 21345, 21435, 21453, 21543, 23145, 23415, 23451, 23541, 25143, 25341, 25413, 25431, 31254, 31452, 32145, 32154, 32514, 32541, 34125, 34152, 34512, 34521, 35214, 35412, 41235, 41253, 41325, 41523, 43125, 43215, 43251, 43521, 45123, 45213, 45231, 45321, 51234, 51432, 52134, 52143, 52314, 52341, 53214, 53412, 54123, 54132, 54312, 54321);
  }
}
