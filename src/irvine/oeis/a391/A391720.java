package irvine.oeis.a391;

import irvine.oeis.InverseSequence;
import irvine.oeis.a243.A243917;

/**
 * A391720 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A391720 extends InverseSequence {

  /** Construct the sequence. */
  public A391720() {
    super(0, 0, new A243917());
  }
}
