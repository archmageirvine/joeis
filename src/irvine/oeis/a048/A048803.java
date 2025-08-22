package irvine.oeis.a048;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007947;

/**
 * A048803 a(n) = Product_{k=1..n} rad(k), where rad(n) is the product of distinct prime factors of n, cf. A007947.
 * @author Sean A. Irvine
 */
public class A048803 extends PartialProductSequence {

  /** Construct the sequence. */
  public A048803() {
    super(new PrependSequence(new A007947(), 1));
  }
}
