package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A055227 Nearest integer to sqrt( n! )..
 * @author Georg Fischer
 */
public class A055227 extends A000142 {

  @Override
  public Z next() {
    final Z fact = super.next();
    final Z root = fact.sqrt();
    final Z root1 = root.add(1);
    return fact.subtract(root.square()).compareTo(root1.square().subtract(fact)) <= 0 ? root : root1;
  }
}
