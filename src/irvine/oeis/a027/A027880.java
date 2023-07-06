package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a024.A024140;

/**
 * A027880 a(n) = Product_{i=1..n} (12^i - 1).
 * @author Sean A. Irvine
 */
public class A027880 extends PartialProductSequence {

  /** Construct the sequence. */
  public A027880() {
    super(new PrependSequence(new A024140().skip(1), Z.ONE));
  }
}
