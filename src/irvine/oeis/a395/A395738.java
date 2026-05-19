package irvine.oeis.a395;

import irvine.oeis.InverseSequence;
import irvine.oeis.a057.A057853;

/**
 * A395738 Index of first occurrence of n in A057853.
 * @author Sean A. Irvine
 */
public class A395738 extends InverseSequence {

  /** Construct the sequence. */
  public A395738() {
    super(2, 2, new A057853());
  }
}
