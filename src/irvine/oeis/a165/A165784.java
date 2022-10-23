package irvine.oeis.a165;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A165784 a(1)=1. For n &gt;= 2, each a(n) = the decimal equivalent of either a(k)U0Ua(k) or a(k)U1Ua(k), where U denotes concatenation of the binary representations of the arguments, and where k is some positive integer &lt; n. The numbers are arranged in numerical order.
 * @author Sean A. Irvine
 */
public class A165784 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z n = mPriority.first();
    mPriority.remove(n);
    final String ns = n.toString(2);
    mPriority.add(new Z(ns + "0" + ns, 2));
    mPriority.add(new Z(ns + "1" + ns, 2));
    return n;
  }
}

