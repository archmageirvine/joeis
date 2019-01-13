#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <unistd.h>
#include <signal.h>
#include <sys/param.h>
#include <pwd.h>

static char *trusted_env[]={"PATH=/usr/bin:/usr/sbin:/sbin:/bin", 0};

int main(int argc, char*argv[]) {
  struct passwd *pwd;

  // attempt to move into uid mode, so can kill other people's processes
  uid_t uid = getuid();
  if ((pwd = getpwuid(uid)) == (struct passwd *) 0) {
    exit(1);
  }
  setuid((uid_t) 0);

  execle("/usr/bin/killall", "/usr/bin/killall", "-q", argc != 2 ? "-STOP" : "-CONT", "ecm", "ecm_localhost", "mpqs-sieve", "gnfs-lasieve4I12e", "gnfs-lasieve4I13e", "gnfs-lasieve4I14e", "lanczos", (char *)0, trusted_env);

  setuid(uid);

  return 0;
}


