package irvine.oeis.a132;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.a003.A003089;
import irvine.oeis.transform.EulerTransform;

/**
 * A132220 Number of line graphs on n unlabeled nodes.
 * @author Georg Fischer
 */
public class A132220 extends EulerTransform {

  /** Construct the sequence. */
  public A132220() {
    super(1, new A003089());
  }
}
