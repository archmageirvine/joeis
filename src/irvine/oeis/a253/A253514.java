package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253514 Centered heptagonal numbers <code>(A069099)</code> which are also centered octagonal numbers <code>(A016754)</code>.
 * @author Sean A. Irvine
 */
public class A253514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253514() {
    super(new long[] {1, -899, 899}, new long[] {1, 841, 755161});
  }
}
