package irvine.oeis.a190;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A190481 Number of distinct integers with n digits which are the image of integers by the function Reverse and Add!.
 * @author Georg Fischer
 */
public class A190481 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A190481() {
    super(1, "[0,4,18,23,-29,-58,-34,-81,-45,-32,-9]", "[1,1,-21,-21,35,35,56,56,19,19]");
  }
}
