package irvine.oeis.a336;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a010.A010785;

/**
 * A336759 a(n) is the smallest positive number that is the sum of no fewer than n distinct repdigits.
 * @author Sean A. Irvine
 */
public class A336759 extends A010785 {

  /** Construct the sequence. */
  public A336759() {
    super(1);
  }

  private final TreeMap<Z, Integer> mMap = new TreeMap<>();

  {
    super.next();
  }

  private Z mNextRepDigit = super.next();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      for (final Map.Entry<Z, Integer> e : mMap.entrySet()) {
        if (e.getKey().compareTo(mNextRepDigit) >= 0) {
          break; // We need to process another repdigit
        } else if (e.getValue() >= mN) {
          return e.getKey();
        }
      }
      // Process the next repdigit updating the minimal numbers
      final TreeMap<Z, Integer> revised = new TreeMap<>();
      for (final Map.Entry<Z, Integer> e : mMap.entrySet()) {
        final Z s = e.getKey().add(mNextRepDigit);
        final int cnt = e.getValue() + 1;
        final Integer prev = mMap.get(s);
        if (prev == null || cnt < prev) {
          revised.put(s, cnt);
        }
      }
      revised.put(mNextRepDigit, 1);
      mMap.putAll(revised);
      mNextRepDigit = super.next();
    }
  }
}
