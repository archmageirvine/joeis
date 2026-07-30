package irvine.oeis.a133;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A133210 A functional 12 tone Musical substitution sequence based on the chord like pattern in: 1-&gt;{1,6,10,11} or Ab,Db,F,Gb 2-&gt;{2,5,9,12} or A,C,E,G 3-&gt;{3,8,11,1} or Bb,Eb,Gb,Ab 4-&gt;{4,7,12,2} or B,D,G,A Characteristic Polynomial: -16 x^2 + 36 x^3 + 36 x^4 - 215 x^5 + 355 x^6 - 368 x^7 + 285 x^8 - 161 x^9 + 59 x^10 - 12 x^11 + x^12.
 * @author Sean A. Irvine
 */
public class A133210 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A133210() {
    super(1, "1", "1", "1->16AC, 2->259B, 3->138C, 4->247B, 5->156C, 6->265B, 7->174C, 8->283B, 9->192C, A->2A5B, B->1B6C, C->2C7B");
  }
}

