package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A384662 Solution of the complementary equation b(n)=a(a(n))+a(n)+2 with a(1)=1; this is the sequence b.
 * @author Sean A. Irvine
 */
public class A384662 extends ComplementSequence {

  /** Construct the sequence. */
  public A384662() {
    super(1, new A384661(), Z.ONE);
  }
}

