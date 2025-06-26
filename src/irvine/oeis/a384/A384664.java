package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A384664 Solution of the complementary equation b(n)=a(a(n))+a(n)+3 with a(1)=1; this is the sequence b. Sequence a is A384663.
 * @author Sean A. Irvine
 */
public class A384664 extends ComplementSequence {

  /** Construct the sequence. */
  public A384664() {
    super(1, new A384663(), Z.ONE);
  }
}

