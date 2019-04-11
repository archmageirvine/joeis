package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085939 Horadam sequence <code>(0,1,6,4)</code>.
 * @author Sean A. Irvine
 */
public class A085939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085939() {
    super(new long[] {6, 4}, new long[] {0, 1});
  }
}
