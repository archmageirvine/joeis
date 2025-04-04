package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221059 Equals one maps: number of n X 3 binary arrays indicating the locations of corresponding elements equal to exactly one of their horizontal and antidiagonal neighbors in a random 0..3 n X 3 array.
 * @author Georg Fischer
 */
public class A221059 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221059() {
    super(1, "[0,4,-7,-44,-32,-4,-16]", "[1,-11,10,104,80,8,32]");
  }
}
