package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168829 Number of reduced words of length n in Coxeter group on 8 generators S_i with relations (S_i)^2 = (S_i S_j)^20 = I.
 * @author Sean A. Irvine
 */
public class A168829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168829() {
    super(new long[] {-21, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, new long[] {8, 56, 392, 2744, 19208, 134456, 941192, 6588344, 46118408, 322828856, 2259801992L, 15818613944L, 110730297608L, 775112083256L, 5425784582792L, 37980492079544L, 265863444556808L, 1861044111897656L, 13027308783283592L, 91191161482985116L}, 1);
  }
}
