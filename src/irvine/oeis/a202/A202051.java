package irvine.oeis.a202;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A202051 Number of (n+2) X 9 binary arrays avoiding patterns 001 and 110 in rows and columns.
 * @author Georg Fischer
 */
public class A202051 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A202051() {
    super(1, new long[] {0, 1926, -11412, 33840, -62496, 77364, -65736, 38052, -14400, 3222,
        -324},
      new long[] {1, -10, 45, -120, 210, -252, 210, -120, 45, -10, 1});
  }
}
