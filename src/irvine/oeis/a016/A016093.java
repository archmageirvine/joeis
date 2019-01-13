package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016093.
 * @author Sean A. Irvine
 */
public class A016093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016093() {
    super(new long[] {-10560, 4216, -626, 41}, new long[] {1, 41, 1055, 21805});
  }
}
