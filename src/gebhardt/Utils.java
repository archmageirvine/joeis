package gebhardt;

/**
 * Utilities for posets.
 * @author Volker Gebhardt
 * @author Sean A. Irvine
 */
public class Utils {

  public static final int MAXN = 22;
  public static final int MAXN_EVEN = 1;
  public static final int LD_MAXN_2 = 5;
  public static final int FSIZE = MAXN_EVEN > 0 ? (MAXN - 2) * (MAXN - 2) / 4 : (MAXN - 3) * (MAXN - 1) / 4;
  public static final long BITSPERFLAGS64 = Long.SIZE;   // 8*sizeof(flags64)
  public static final int ORBITS_INITIAL_ORBSPACE = 128;
  public static final int ORBITS_INITIAL_SISPACE = 32;

  static long BIT(final long i) {
    return 1L << i;
  }

  /*
   * If f is zero, return 0.  Otherwise, set i[0] to the rank of the least significant bit set in f, clear the bit and return 1.
   */
  static boolean extractLSB32(final int[] f, final int[] i) {
    if (f[0] == 0) {
      return false;
    }
    i[0] = Integer.numberOfTrailingZeros(f[0]); //lowestOneBit(f[0]); //__builtin_ctz( * f);
    f[0] ^= BIT(i[0]);
    return true;
  }

  /*
   * If f is zero, return 0.  Otherwise, set *i to the rank of the most significant bit set in f, clear the bit and return 1.
   * NOTE:
   */
  static boolean extractMSB32(final int[] f, final int[] i)
  {
    if (f[0] == 0) {
      return false;
    }
	i[0] = 31 - Integer.numberOfLeadingZeros(f[0]); //__builtin_clz(*f);
	f[0] ^= BIT(i[0]);
    return true;
  }

  /*
   * If f is zero, return 0.  Otherwise, set *i to the rank of the least significant bit set in f and return 1.
   */
  static boolean getLSB32(final int f, final int[] i)  {
    if (f==0) {
      return false;
    }
    i[0] = Integer.numberOfTrailingZeros(f); //__builtin_ctz(f);
    return true;
  }


  /*
   * If f is zero, return 0.  Otherwise, set *i to the rank of the most significant bit set in f and return 1.
   * NOTE:
   */
  static boolean getMSB32(final int f, final int[] i) {
    if (f == 0) {
      return false;
    }
    i[0] = 31 - Integer.numberOfLeadingZeros(f); // __builtin_clz(f);
    return true;
  }

  /*
   * Return a mask with bits 0..n-1 set.
   */
  static int allBits32(final int n)
  {
    return (1 << n) - 1;
  }
}
