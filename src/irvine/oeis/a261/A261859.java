package irvine.oeis.a261;
// Generated by gen_seq4.pl build/treonk

import irvine.math.z.Z;

/**
 * A261859 Number of compositions of n into distinct parts where each part i is marked with a word of length i over an octonary alphabet whose letters appear in alphabetical order and all letters occur at least once in the composition.
 * @author Georg Fischer
 */
public class A261859 extends A261836 {

  private int mN = 7;

  {
    setOffset(8);
  }

  @Override
  public Z next() {
    ++mN;
    return super.triangleElement(mN, 8);
  }
}

