package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055368 Number of asymmetric mobiles (circular rooted trees) with n nodes and 7 leaves.
 * @author Georg Fischer
 */
public class A055368 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055368() {
    super(8, A055278.computeRecurrence(7), "1, 10, 63, 310, 1260, 4423, 13772, 38876, 101036, 244770, 558083, 1206992, 2491908, 4937234, 9429273, 17423919, 31251810, 54558739, 92928819, 154753337, 252422630, 403940910, 635084757, 982257860, 1496223663, 2246941496, 3329771231, 4873370590, 7049661880, 10086322598, 14282323200, 20027135956, 27824327079, 38320372615, 52339650458", 0);
  }
}

