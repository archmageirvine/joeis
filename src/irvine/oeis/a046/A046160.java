package irvine.oeis.a046;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Quadruple;

/**
 * A046160 Bends of spheres in Soddy's bowl of integers which are tangent to the unit sphere and a single 2-sphere.
 * @author Sean A. Irvine
 */
public class A046160 extends Sequence1 {

  // After Martin Fuller

  private final PriorityQueue<Quadruple<Long>> mQueue = new PriorityQueue<>(Comparator.comparingLong(Quadruple::a));
  private final List<Long> mR = new ArrayList<>();
  private boolean mFirst = true;

  /** Construct the sequence. */
  public A046160() {
    mQueue.add(new Quadruple<>(5L, 3L, 2L, -1L));
    mR.add(2L);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.TWO;
    }
    while (true) {
      final Quadruple<Long> k = mQueue.poll();
      if (k == null) {
        throw new RuntimeException("Queue unexpectedly empty");
      }
      final long last = mR.get(mR.size() - 1);
      final long s = k.a() + k.b() + k.c() + k.d();
      final long ss = k.a() * k.a() + k.b() * k.b() + k.c() * k.c() + k.d() * k.d();
      final long t = 3 * (s * s - 2 * ss);
      if (t >= 0) {
        final long kn = (long) Math.sqrt(t);
        final long next = (kn + s) / 2;
        if (next > k.a()) {
          mQueue.add(new Quadruple<>(next, k.b(), k.c(), k.d()));
        }
        if (next >= k.a() && next > k.b()) {
          mQueue.add(new Quadruple<>(next, k.a(), k.c(), k.d()));
        }
      }
      if (k.a() > last) {
        mR.add(k.a());
        return Z.valueOf(k.a());
      }
    }
  }
}
