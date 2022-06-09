package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a080.A080032;

/**
 * A079313 a(n) is taken to be the smallest positive integer not already present which is consistent with the condition "n is a member of the sequence if and only if a(n) is odd".
 * @author Georg Fischer
 */
public class A079313 extends A080032 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
