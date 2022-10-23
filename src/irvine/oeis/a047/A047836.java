package irvine.oeis.a047;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047836 "Nullwertzahlen" (or "inverse prime numbers"): n=p1*p2*p3*p4*p5*...*pk, where pi are primes with p1 &lt;= p2 &lt;= p3 &lt;= p4 ...; then p1 = 2 and p1*p2*...*pi &gt;= p(i+1) for all i &lt; k.
 * @author Sean A. Irvine
 */
public class A047836 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  protected A047836(final Z initial) {
    mA.add(initial);
  }

  /** Construct the sequence. */
  public A047836() {
    this(Z.TWO);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    for (Z k = Z.TWO; k.compareTo(res) <= 0; k = k.add(1)) {
      mA.add(res.multiply(k));
    }
    return res;
  }
}
