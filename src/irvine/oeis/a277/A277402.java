package irvine.oeis.a277;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A277402 "3-Portolan numbers": number of regions formed by n-secting the angles of an equilateral triangle.
 * @author Georg Fischer
 */
public class A277402 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A277402() {
    super(1, "[0,1,5,12,6,18,6,18,6,18,-6,29,13,-6]", "[1,-1,-1,1,0,0,0,0,0,0,-1,1,1,-1]");
  }
}
