package irvine.oeis.a164;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A164933 Word structures of length n using a 10-ary alphabet, including a special character, which may occur in the leftmost word position only if n=1.
 * @author Georg Fischer
 */
public class A164933 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A164933() {
    super(0, new long[] {1, -43, 774, -7538, 42574, -136061, 202072, 35157, -478089, 403200},
      new long[] {1, -45, 861, -9135, 58674, -233100, 557864, -732960, 403200});
  }
}
