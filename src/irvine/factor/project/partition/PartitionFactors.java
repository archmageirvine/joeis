package irvine.factor.project.partition;

import irvine.factor.factor.CachedFactorizer;
import irvine.factor.factor.Cheetah;
import irvine.factor.factor.FactorDbFactorizer;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.partitions.IntegerPartition;

/**
 * Retrieve known factorizations of partition numbers.
 * Backed by <code>factordb.com</code>.
 *
 * @author Sean A. Irvine
 */
public class PartitionFactors {

  private final Cheetah mCheetah = new Cheetah(false);
  private final Factorizer mFactorizer = new CachedFactorizer(new FactorDbFactorizer());

  private String toString(final FactorSequence fs) {
    final StringBuilder sb = new StringBuilder();
    for (final Z n : fs.toZArray()) {
      if (sb.length() > 0) {
        sb.append('.');
      }
      final int status = fs.getStatus(n);
      final boolean p = status == FactorSequence.PRIME || status == FactorSequence.PROB_PRIME;
      if (!p) {
        sb.append('(');
      }
      sb.append(n);
      final int exp = fs.getExponent(n);
      if (exp > 1) {
        sb.append('^').append(exp);
      }
      if (!p) {
        sb.append(')');
      }
    }
    return sb.toString();
  }

  void partition(final int index) {
    System.out.print(index + " ");
    if (index < 2) {
      System.out.println(1);
    } else {
      final Z n = IntegerPartition.partitions(index);
      if (n.isProbablePrime()) {
        System.out.println(n);
      } else {
        FactorSequence fs = new FactorSequence(n);
        mCheetah.factor(fs);
        if (!fs.isComplete()) {
          // Remake the sequence for better compatability with factordb
          fs = new FactorSequence(n);
          mFactorizer.factor(fs);
        }
        System.out.println(toString(fs));
      }
    }
  }

  /**
   * Main program.
   * @param args index of partition numbers to generate in the form of
   * single numbers or ranges of numbers.
   */
  public static void main(final String[] args) {
    final PartitionFactors as = new PartitionFactors();
    for (final String a : args) {
      final int hyphen = a.indexOf('-');
      if (hyphen != -1) {
        // Deal with a range like 10-100
        final int first = Integer.parseInt(a.substring(0, hyphen));
        final int last = Integer.parseInt(a.substring(hyphen + 1));
        for (int p = first; p < last; ++p) {
          as.partition(p);
        }
      } else {
        // Deal with a single number
        as.partition(Integer.parseInt(a));
      }
    }
  }

}

