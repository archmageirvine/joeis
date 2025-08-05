package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a026.A026363;

/**
 * A079255 a(n) is taken to be the smallest positive integer greater than a(n-1) such that the condition "n is in the sequence if and only if a(n) is odd and a(n+1) is even" can be satisfied.
 * @author Sean A. Irvine
 */
public class A079255 extends Sequence1 {

  private final Sequence mA = new PrependSequence(new A026363(), 0);

  @Override
  public Z next() {
    final Z res = mA.next().add(1);
    mA.next();
    return res;
  }
}

