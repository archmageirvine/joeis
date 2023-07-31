package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A064869 The minimal number which has multiplicative persistence 5 in base n.
 * @author Sean A. Irvine
 */
public class A064869 extends AbstractSequence {

  private static final long[] SMALL = {244140624, 3629, 1601, 1535, 394, 679, 317, 1099, 127, 135, 582, 187, 168, 157, 201, 159, 230, 215, 180, 185, 246, 181, 188, 195, 198, 323, 239, 255, 259, 267, 239, 287, 295, 293, 310, 313, 280, 377, 375, 395, 347, 360, 321, 370, 439, 431, 458, 355, 362, 376, 383, 390, 397, 396, 403, 477, 479, 478, 493, 437, 444, 509, 534, 534, 532, 478, 485, 555, 563, 579, 512, 519, 526, 543, 550, 557, 553, 560, 567, 585, 592, 599, 594, 601, 608, 629, 636, 643, 635, 642, 649, 671, 678, 669, 676, 683, 690, 713, 717, 710, 717, 724, 731, 752, 759, 751, 758, 765, 772, 794, 801, 792, 799, 806, 813};
  private long mN = 4;

  /** Construct the sequence. */
  public A064869() {
    super(5);
  }

  @Override
  public Z next() {
    if (++mN <= 119) {
      return Z.valueOf(SMALL[(int) (mN - 5)]);
    } else {
      return Z.valueOf(6L * mN - mN / 120);
    }
  }
}

