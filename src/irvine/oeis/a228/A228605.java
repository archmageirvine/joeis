package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228605 The Merrifield-Simmons index of the meta-polyphenylene chain of length <code>n</code>.
 * @author Sean A. Irvine
 */
public class A228605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228605() {
    super(new long[] {11, 16}, new long[] {1, 18});
  }
}
