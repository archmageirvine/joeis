package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246880.
 * @author Sean A. Irvine
 */
public class A246880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246880() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 609, 66099});
  }
}
