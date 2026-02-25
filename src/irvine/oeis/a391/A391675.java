package irvine.oeis.a391;

import irvine.oeis.InverseSequence;
import irvine.oeis.a243.A243865;

/**
 * A391675 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A391675 extends InverseSequence {

  /** Construct the sequence. */
  public A391675() {
    // Some trickery to make a(1)=-1
    super(0, 0, new A243865().prepend(1, 1), -1);
  }
}

