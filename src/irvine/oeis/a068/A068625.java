package irvine.oeis.a068;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a052.A052410;

/**
 * A068625 Reduced root factorial of n: product of the smallest integer root of numbers from 1 to n.
 * @author Georg Fischer
 */
public class A068625 extends PartialProductSequence {

  /** Construct the sequence. */
  public A068625() {
    super(0, new PrependSequence(new A052410(), 1));
  }
}
