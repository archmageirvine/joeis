package irvine.oeis.a321;

import irvine.oeis.FiniteSequence;

/**
 * A321148 <code>a(1) = 24603, a(n) = n*a(n-1)</code> but products that are not in <code>A010784</code> are first reduced as in <code>A320486</code> (see comments); continue until zero is reached.
 * @author Georg Fischer
 */
public class A321148 extends FiniteSequence {

  /** Construct the sequence. */
  public A321148() {
    super(24603, 49206, 4768, 19072, 95360, 572160, 4512, 309, 2781, 27810, 3591, 43092, 5019, 702, 153, 28, 476, 56, 1064, 180, 3780, 83160, 92680, 430, 175, 40, 18, 504, 4, 120, 3720, 94, 3102, 105468, 69180, 298, 26, 9, 351, 1, 41, 17, 731, 32164, 17380, 7480, 3160, 5680, 7830, 3915, 15, 780, 130, 72, 3960, 1760, 132, 75, 25, 15, 915, 56730, 570, 36480, 371, 286, 962, 541, 729, 513, 642, 6, 438, 341, 27, 5, 385, 0);
  }
}
