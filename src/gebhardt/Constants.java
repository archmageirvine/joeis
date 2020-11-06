package gebhardt;

/**
 * Constants for posets.
 * @author Volker Gebhardt
 * @author Sean A. Irvine
 */
public class Constants {

  public static final int MAXN = 22;
  public static final int MAXN_EVEN = 1;
  public static final int LD_MAXN_2 = 5;
  public static final long FSIZE = MAXN_EVEN > 0 ? (MAXN - 2) * (MAXN - 2) / 4 : (MAXN - 3) * (MAXN - 1) / 4;
  public static final long BITSPERFLAGS64 = Long.SIZE;   // 8*sizeof(flags64)
}
