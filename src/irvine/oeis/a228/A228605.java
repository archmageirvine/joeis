package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228605 The Merrifield-Simmons index of the meta-polyphenylene chain of length n.
 * @author Sean A. Irvine
 */
public class A228605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228605() {
    super(new long[] {11, 16}, new long[] {1, 18});
  }
}
