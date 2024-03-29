package irvine.oeis.a273;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-30 21:33

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A273714 Number of doublerises in all bargraphs having semiperimeter n (n&gt;=2). A doublerise in a bargraph is any pair of adjacent up steps.
 * @author Georg Fischer
 */
public class A273714 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A273714() {
    super(2, "[[0],[6,-1],[8,-2],[8,-1],[-6],[-18, 9],[6,-6],[0, 1]]", "0, 1, 4, 14, 47, 155, 508", 0);
  }
}
