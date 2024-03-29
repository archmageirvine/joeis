package irvine.oeis.a250;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250896 Number of (n+1) X (6+1) 0..2 arrays with nondecreasing x(i,j)-x(i,j-1) in the i direction and nondecreasing absolute value of x(i,j)-x(i-1,j) in the j direction.
 * @author Georg Fischer
 */
public class A250896 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A250896() {
    super(1, new long[] {0, 10875, -99285, 368950, -715664, 755858, -402400, 50022, 63432,
        -26568},
      new long[] {1, -12, 60, -162, 255, -234, 116, -24});
  }
}
