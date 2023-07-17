package irvine.oeis.a035;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A035493 Order in which new cards appear on top of deck in Guy's shuffling problem A035485.
 * @author Sean A. Irvine
 */
public class A035493 extends A035485 {

  /** Construct the sequence. */
  public A035493() {
    super(1);
  }

  private final TreeSet<Z> mSeen = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mSeen.add(t)) {
        return t;
      }
    }
  }
}

