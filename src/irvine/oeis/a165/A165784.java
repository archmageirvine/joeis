package irvine.oeis.a165;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A165784 <code>a(1)=1</code>. For <code>n &gt;= 2</code>, each <code>a(n) =</code> the decimal equivalent of either a(k)U0Ua(k) or a(k)U1Ua(k), where U denotes concatenation of the binary representations of the arguments, and where k is some positive integer <code>&lt; n</code>. The numbers are arranged in numerical order.
 * @author Sean A. Irvine
 */
public class A165784 implements Sequence {

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

