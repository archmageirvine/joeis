package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A084229 Let b(1)=1, b(2)=2, b(n) = sum of digits of b(1)+b(2)+b(3)+...+b(n-1), sequence gives values of n such that b(n)=3.
 * @author Sean A. Irvine
 */
public class A084229 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084229() {
    super(1, new A084228(), Z.THREE::equals);
  }
}
