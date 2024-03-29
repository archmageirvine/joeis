package irvine.oeis.a293;
// Generated by gen_seq4.pl build/treonk

import irvine.math.z.Z;
import irvine.oeis.a261.A261719;

/**
 * A293369 Number of partitions of n where each part i is marked with a word of length i over a quinary alphabet whose letters appear in alphabetical order and all five letters occur at least once in the partition.
 * @author Georg Fischer
 */
public class A293369 extends A261719 {

  private int mN = 4;

  {
    setOffset(5);
  }

  @Override
  public Z next() {
    ++mN;
    return super.triangleElement(mN, 5);
  }
}

